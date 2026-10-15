package com.volcengine.model.tls.stats;

/** Immutable options for a single snapshot projection. */
public final class StatsOptions {
    private final StatsView view;

    public StatsOptions(StatsView view) {
        if (view == null) {
            throw new IllegalArgumentException("view must not be null");
        }
        this.view = view;
    }

    public static StatsOptions health() {
        return new StatsOptions(StatsView.HEALTH);
    }

    public static StatsOptions operational() {
        return new StatsOptions(StatsView.OPERATIONAL);
    }

    public static StatsOptions debug() {
        return new StatsOptions(StatsView.DEBUG);
    }

    public StatsView getView() {
        return view;
    }
}
