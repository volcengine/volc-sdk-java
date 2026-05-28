package com.volcengine.model.tls;

import org.junit.Assert;
import org.junit.Test;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class SignDumpTest {
    @Test
    public void resolvesFixtureByWalkingUpFromNestedCheckout() throws Exception {
        Path root = Files.createTempDirectory("sign-root");
        Path fixture = root.resolve("cospec/changes/check-tls-sdk-contract-alignment/context/l4-snapshots/fixture.json");
        Files.createDirectories(fixture.getParent());
        Files.write(fixture, "{}".getBytes(StandardCharsets.UTF_8));

        Path nested = root.resolve("repos/volc-sdk-java/volc-sdk-java");
        Files.createDirectories(nested);

        Assert.assertEquals(fixture, SignDump.resolveFixturePath(null, null, nested));
    }

    @Test
    public void explicitFixturePathWins() throws Exception {
        Path fixture = Files.createTempFile("sign-fixture", ".json");

        Assert.assertEquals(fixture, SignDump.resolveFixturePath(fixture.toString(), null, Files.createTempDirectory("ignored")));
    }

    @Test
    public void outputDefaultsToTempDirectory() throws Exception {
        Path out = SignDump.resolveOutputPath(null);

        Assert.assertEquals("sign-java.txt", out.getFileName().toString());
        Assert.assertTrue(Files.exists(out.getParent()));
    }
}
