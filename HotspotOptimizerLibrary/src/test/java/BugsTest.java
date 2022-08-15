import com.assetco.search.results.Asset;
import com.assetco.search.results.AssetVendor;
import com.assetco.search.results.AssetVendorRelationshipLevel;
import com.assetco.search.results.HotspotKey;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class BugsTest {

    @Test
    public void precedingPartnerWithLongTrailingAssetsDoesNotWin() {
        AssetVendor partnerVendor = makeVendor(AssetVendorRelationshipLevel.Partner);
        Asset missing = givenAssetInResultsWithVendor(partnerVendor);

        AssetVendor anotherPartnerVendor = makeVendor(AssetVendorRelationshipLevel.Partner);
        Asset disrupting = givenAssetInResultsWithVendor(anotherPartnerVendor);
        
        List<Asset> expected = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            expected.add(givenAssetInResultsWithVendor(partnerVendor));
        }

        whenOptimize();
        thenHotspotDoesNotHave(HotspotKey.Showcase, missing);
        thenHotspotDoesHasExactly(HotspotKey.Showcase, expected);
    }

    private Asset givenAssetInResultsWithVendor(AssetVendor partnerVendor) {
        return null;
    }

    private AssetVendor makeVendor(AssetVendorRelationshipLevel level) {
        return null;
    }

    void whenOptimize() {

    }

    void thenHotspotDoesNotHave(HotspotKey hotspotKey, Asset... assets) {

    }

    void thenHotspotDoesHasExactly(HotspotKey hotspotKey, List<Asset> assets) {

    }
}
