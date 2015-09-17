package io.searchbox.core;

import io.searchbox.client.JestResult;
import io.searchbox.common.AbstractIntegrationTest;
import org.elasticsearch.test.ESIntegTestCase;
import org.junit.Test;

import java.io.IOException;

/**
 * @author Dogukan Sonmez
 */
@ESIntegTestCase.ClusterScope(scope = ESIntegTestCase.Scope.SUITE, numDataNodes = 1)
public class MoreLikeThisIntegrationTest extends AbstractIntegrationTest {

    @Test
    public void moreLikeThis() throws IOException {
        MoreLikeThis moreLikeThis = new MoreLikeThis.Builder("twitter", "tweet", "1", null).build();
        JestResult result = client.execute(moreLikeThis);
        assertFalse(result.isSucceeded());
    }

}
