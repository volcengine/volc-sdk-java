package com.volcengine.model.tls.stats;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class WorkerDetails {
    public static final int MAX_ITEMS = 64;
    private final long totalCount;
    private final List<WorkerDetail> items;

    public WorkerDetails(long totalCount, List<WorkerDetail> items) {
        if (items == null || items.size() > MAX_ITEMS || totalCount < items.size()) {
            throw new IllegalArgumentException("invalid bounded worker details");
        }
        StatsValidation.noNulls(items, "worker details");
        this.totalCount = totalCount;
        this.items = Collections.unmodifiableList(new ArrayList<>(items));
    }

    public long getTotalCount() { return totalCount; }
    public List<WorkerDetail> getItems() { return items; }

    /** Fixed role aggregates; never expands one item per thread or shard. */
    public static WorkerDetails forRoles(List<WorkerRoleStats> roles) {
        if (roles == null) throw new IllegalArgumentException("worker roles are required");
        List<WorkerDetail> items = new ArrayList<>(Math.min(roles.size(), MAX_ITEMS));
        for (int i = 0; i < roles.size() && i < MAX_ITEMS; i++) {
            WorkerRoleStats role = roles.get(i);
            if (role == null) throw new IllegalArgumentException("worker role is required");
            items.add(new WorkerDetail(role.getRole(), Math.toIntExact(role.getExpected()),
                    Math.toIntExact(role.getRunning()), role.getInFlight()));
        }
        return new WorkerDetails(roles.size(), items);
    }

    String toJson() {
        List<String> json = new ArrayList<>(items.size());
        for (WorkerDetail item : items) json.add(item.toJson());
        return new JsonWriter().raw("items", JsonWriter.rawArray(json))
                .bool("truncated", totalCount > items.size()).end();
    }
}
