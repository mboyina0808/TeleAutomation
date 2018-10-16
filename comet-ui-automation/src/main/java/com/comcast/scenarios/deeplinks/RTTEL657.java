package com.comcast.scenarios.deeplinks;

import com.comcast.SeleniumUtils;
import com.comcast.checkers.ChartAvailableChecker;
import com.comcast.checkers.SettingChecker;
import org.junit.Test;


public class RTTEL657 {

    @Test
    public void verifyDvr_negative() {

        String path;
        path="/#/page/dvr/dvr_postcomplete_response_count?reload=false&stack=poc17dvr";
        SeleniumUtils.performQuery(path);
        ChartAvailableChecker.performCheck(1);
        SettingChecker.performCheck("stack", "All");

        path="/#/page/dvr/dvr_swsengine_function_average?reload=false&stack=poc71dvr";
        SeleniumUtils.performQuery(path);
        ChartAvailableChecker.performCheck(1);
        SettingChecker.performCheck("stack", "All");

        path="/#/page/dvr/dvr_swsengine_function_count?reload=false&stack=poc71dvr";
        SeleniumUtils.performQuery(path);
        ChartAvailableChecker.performCheck(1);
        SettingChecker.performCheck("stack", "All");

        path="/#/page/dvr/dvr_swspost_function_count?reload=false&stack=poc7d1vr";
        SeleniumUtils.performQuery(path);
        ChartAvailableChecker.performCheck(1);
        SettingChecker.performCheck("stack", "All");

        path="/#/page/dvr/dvr_swsget_function_count_more5?reload=false&stack=poc7d1vr";
        SeleniumUtils.performQuery(path);
        ChartAvailableChecker.performCheck(1);
        SettingChecker.performCheck("stack", "All");

        path="/#/page/dvr/dvr_swsget_responsecode_count?reload=false&stack=poc7dv1r";
        SeleniumUtils.performQuery(path);
        ChartAvailableChecker.performCheck(1);
        SettingChecker.performCheck("stack", "All");

        path="/#/page/dvr/dvr_total_count?reload=false&dataParam=SWS1POST&stack=poc7dvr";
        SeleniumUtils.performQuery(path);
        ChartAvailableChecker.performCheck(1);
        SettingChecker.performCheck("stack", "All");
        SettingChecker.performCheck("dataParam", "All");

        path="/#/page/dvr/dvr_total_count?reload=false&dataParam=SWSPOST&stack=poc27dvr";
        SeleniumUtils.performQuery(path);
        ChartAvailableChecker.performCheck(1);
        SettingChecker.performCheck("stack", "All");
        SettingChecker.performCheck("dataParam", "All");

    }

    @Test
    public void verifyDvr_positive() {

        String path;
        path="/#/page/dvr/dvr_postcomplete_response_count?reload=false&stack=poc7dvr";
        SeleniumUtils.performQuery(path);
        ChartAvailableChecker.performCheck(1);
        SettingChecker.performCheck("stack", "poc7dvr");

        path="/#/page/dvr/dvr_swsengine_function_average?reload=false&stack=poc7dvr";
        SeleniumUtils.performQuery(path);
        ChartAvailableChecker.performCheck(1);
        SettingChecker.performCheck("stack", "poc7dvr");

        path="/#/page/dvr/dvr_swsengine_function_count?reload=false&stack=poc7dvr";
        SeleniumUtils.performQuery(path);
        ChartAvailableChecker.performCheck(1);
        SettingChecker.performCheck("stack", "poc7dvr");

        path="/#/page/dvr/dvr_swspost_function_count?reload=false&stack=poc7dvr";
        SeleniumUtils.performQuery(path);
        ChartAvailableChecker.performCheck(1);
        SettingChecker.performCheck("stack", "poc7dvr");

        path="/#/page/dvr/dvr_swsget_function_count_more5?reload=false&stack=poc7dvr";
        SeleniumUtils.performQuery(path);
        ChartAvailableChecker.performCheck(1);
        SettingChecker.performCheck("stack", "poc7dvr");

        path="/#/page/dvr/dvr_swsget_responsecode_count?reload=false&stack=poc7dvr";
        SeleniumUtils.performQuery(path);
        ChartAvailableChecker.performCheck(1);
        SettingChecker.performCheck("stack", "poc7dvr");

        path="/#/page/dvr/dvr_total_count?reload=false&dataParam=SWSPOST&stack=poc7dvr";
        SeleniumUtils.performQuery(path);
        ChartAvailableChecker.performCheck(1);
        SettingChecker.performCheck("stack", "poc7dvr");
        SettingChecker.performCheck("dataParam", "SWSPOST");

    }

    @Test
    public void verifySmart_negative() {

        String path;
        path="/#/page/smart/smart_statistics?reload=false&dataParam=smart-tele1metry&groupParamValue=telemetry.STORM_METRIC&originatingSubSourceType=xre";
        SeleniumUtils.performQuery(path);
        ChartAvailableChecker.performCheck(1);
        SettingChecker.performCheck("dataParam", "All");
        SettingChecker.performCheck("groupParamValue", "All");

        path="/#/page/smart/smart_statistics?reload=false&dataParam=smart-telemetry&groupParamValue=telemetry.ST1ORM_METRIC&originatingSubSourceType=xre";
        SeleniumUtils.performQuery(path);
        ChartAvailableChecker.performCheck(1);
        SettingChecker.performCheck("dataParam", "All");
        SettingChecker.performCheck("groupParamValue", "All");

        path="/#/page/smart/smart_statistics?reload=false&dataParam=smart-telemetry&groupParamValue=telemetry.STORM_METRIC&originatingSubSourceType=1xre";
        SeleniumUtils.performQuery(path);
        ChartAvailableChecker.performCheck(1);
        SettingChecker.performCheck("dataParam", "All");
        SettingChecker.performCheck("groupParamValue", "All");

    }

    @Test
    public void verifySmart_positive() {

        String path;
        path="/#/page/smart/smart_statistics?reload=false&dataParam=smart-telemetry&groupParamValue=telemetry.STORM_METRIC&originatingSubSourceType=xre";
        SeleniumUtils.performQuery(path);
        ChartAvailableChecker.performCheck(1);
        SettingChecker.performCheck("dataParam", "smart-telemetry");
        SettingChecker.performCheck("groupParamValue", "telemetry.STORM_METRIC");
        SettingChecker.performCheck("originatingSubSourceType", "xre");

    }

    @Test
    public void verifyAppDS_negative() {

        String path;

        path="/#/page/appds/appds_request_duration?reload=false&dataParam=c5c0app1ds&groupParamValue=writeMinDataService&dataParamName=percentile95&host=tvxads-c5-c00034-b";
        SeleniumUtils.performQuery(path);
        ChartAvailableChecker.performCheck(1);
        SettingChecker.performCheck("-dataParam-", "All");
        SettingChecker.performCheck("groupParamValue", "All");
        SettingChecker.performCheck("dataParamName", "99th Percentile");
        SettingChecker.performCheck("host", "All");

        path="/#/page/appds/appds_request_duration?reload=false&dataParam=c5c0appds&groupParamValue=writeM1inDataService&dataParamName=percentile95&host=tvxads-c5-c00034-b";
        SeleniumUtils.performQuery(path);
        ChartAvailableChecker.performCheck(1);
        SettingChecker.performCheck("-dataParam-", "All");
        SettingChecker.performCheck("groupParamValue", "All");
        SettingChecker.performCheck("dataParamName", "99th Percentile");
        SettingChecker.performCheck("host", "All");

        path="/#/page/appds/appds_request_duration?reload=false&dataParam=c5c0appds&groupParamValue=writeMinDataService&dataParamName=per1centile95&host=tvxads-c5-c00034-b";
        SeleniumUtils.performQuery(path);
        ChartAvailableChecker.performCheck(1);
        SettingChecker.performCheck("-dataParam-", "All");
        SettingChecker.performCheck("groupParamValue", "All");
        SettingChecker.performCheck("dataParamName", "99th Percentile");
        SettingChecker.performCheck("host", "All");

        path="/#/page/appds/appds_request_duration?reload=false&dataParam=c5c0appds&groupParamValue=writeMinDataService&dataParamName=percentile95&host=tvx1ads-c5-c00034-b";
        SeleniumUtils.performQuery(path);
        ChartAvailableChecker.performCheck(1);
        SettingChecker.performCheck("-dataParam-", "All");
        SettingChecker.performCheck("groupParamValue", "All");
        SettingChecker.performCheck("dataParamName", "99th Percentile");
        SettingChecker.performCheck("host", "All");

//--------------------------

        path="/#/page/appds/appds_request_total?reload=false&dataParam=c5c0ap1pds&groupParamValue=writeMinDataService&host=tvxads-c5-c00034-b";
        SeleniumUtils.performQuery(path);
        ChartAvailableChecker.performCheck(1);
        SettingChecker.performCheck("-dataParam-", "All");
        SettingChecker.performCheck("groupParamValue", "All");
        SettingChecker.performCheck("host", "All");

        path="/#/page/appds/appds_request_total?reload=false&dataParam=c5c0appds&groupParamValue=writeMi1nDataService&host=tvxads-c5-c00034-b";
        SeleniumUtils.performQuery(path);
        ChartAvailableChecker.performCheck(1);
        SettingChecker.performCheck("-dataParam-", "All");
        SettingChecker.performCheck("groupParamValue", "All");
        SettingChecker.performCheck("host", "All");

        path="/#/page/appds/appds_request_total?reload=false&dataParam=c5c0appds&groupParamValue=writeMinDataService&host=tvxads-c5-c010034-b";
        SeleniumUtils.performQuery(path);
        ChartAvailableChecker.performCheck(1);
        SettingChecker.performCheck("-dataParam-", "All");
        SettingChecker.performCheck("groupParamValue", "All");
        SettingChecker.performCheck("host", "All");
//--------------------------
        path="/#/page/appds/appds_error?reload=false&dataParam=c5c0ap5pds&groupParamValue=writeMinDataService&host=tvxads-c5-c00034-b";
        SeleniumUtils.performQuery(path);
        ChartAvailableChecker.performCheck(1);
        SettingChecker.performCheck("-dataParam-", "All");
        SettingChecker.performCheck("groupParamValue", "All");
        SettingChecker.performCheck("host", "All");

        path="/#/page/appds/appds_error?reload=false&dataParam=c5c0appds&groupParamValue=writeMi5DataService&host=tvxads-c5-c00034-b";
        SeleniumUtils.performQuery(path);
        ChartAvailableChecker.performCheck(1);
        SettingChecker.performCheck("-dataParam-", "All");
        SettingChecker.performCheck("groupParamValue", "All");
        SettingChecker.performCheck("host", "All");

        path="/#/page/appds/appds_error?reload=false&dataParam=c5c0appds&groupParamValue=writeMinDataService&host=tvxads-c5-c050034-b";
        SeleniumUtils.performQuery(path);
        ChartAvailableChecker.performCheck(1);
        SettingChecker.performCheck("-dataParam-", "All");
        SettingChecker.performCheck("groupParamValue", "All");
        SettingChecker.performCheck("host", "All");
//--------------------------
        path="/#/page/appds/appds_slow_request?reload=false&dataParam=c5c0appds&groupParamValue=writeMinDataService&host=tvxads-c5-c040034-b";
        SeleniumUtils.performQuery(path);
        ChartAvailableChecker.performCheck(1);
        SettingChecker.performCheck("-dataParam-", "All");
        SettingChecker.performCheck("groupParamValue", "All");
        SettingChecker.performCheck("host", "All");

        path="/#/page/appds/appds_slow_request?reload=false&dataParam=c5c0a2ppds&groupParamValue=writeMinDataService&host=tvxads-c5-c00034-b";
        SeleniumUtils.performQuery(path);
        ChartAvailableChecker.performCheck(1);
        SettingChecker.performCheck("-dataParam-", "All");
        SettingChecker.performCheck("groupParamValue", "All");
        SettingChecker.performCheck("host", "All");

        path="/#/page/appds/appds_slow_request?reload=false&dataParam=c5c0appds&groupParamValue=writeMin2DataService&host=tvxads-c5-c00034-b";
        SeleniumUtils.performQuery(path);
        ChartAvailableChecker.performCheck(1);
        SettingChecker.performCheck("-dataParam-", "All");
        SettingChecker.performCheck("groupParamValue", "All");
        SettingChecker.performCheck("host", "All");
//--------------------------
        path="/#/page/appds/appds_general?reload=false&dataParam=c5c0ap3pds&groupParamValue=writeMinDataService&host=tvxads-c5-c00034-b&dataParamName=errCount";
        SeleniumUtils.performQuery(path);
        ChartAvailableChecker.performCheck(1);
        SettingChecker.performCheck("-dataParam-", "All");
        SettingChecker.performCheck("groupParamValue", "All");
        SettingChecker.performCheck("host", "All");
        SettingChecker.performCheck("dataParamName", "Total requests");

        path="/#/page/appds/appds_general?reload=false&dataParam=c5c0appds&groupParamValue=writeMin3DataService&host=tvxads-c5-c00034-b&dataParamName=errCount";
        SeleniumUtils.performQuery(path);
        ChartAvailableChecker.performCheck(1);
        SettingChecker.performCheck("-dataParam-", "All");
        SettingChecker.performCheck("groupParamValue", "All");
        SettingChecker.performCheck("host", "All");
        SettingChecker.performCheck("dataParamName", "Total requests");

        path="/#/page/appds/appds_general?reload=false&dataParam=c5c0appds&groupParamValue=writeMinDataService&host=tvxads-c5-c000334-b&dataParamName=errCount";
        SeleniumUtils.performQuery(path);
        ChartAvailableChecker.performCheck(1);
        SettingChecker.performCheck("-dataParam-", "All");
        SettingChecker.performCheck("groupParamValue", "All");
        SettingChecker.performCheck("host", "All");
        SettingChecker.performCheck("dataParamName", "Total requests");

        path="/#/page/appds/appds_general?reload=false&dataParam=c5c0appds&groupParamValue=writeMinDataService&host=tvxads-c5-c00034-b&dataParamName=err3Count";
        SeleniumUtils.performQuery(path);
        ChartAvailableChecker.performCheck(1);
        SettingChecker.performCheck("-dataParam-", "All");
        SettingChecker.performCheck("groupParamValue", "All");
        SettingChecker.performCheck("host", "All");
        SettingChecker.performCheck("dataParamName", "Total requests");

    }

    @Test
    public void verifyAppDS_positive() {

        String path;

        path="/#/page/appds/appds_request_duration?reload=false&dataParam=c5c0appds&groupParamValue=writeMinDataService&dataParamName=percentile95&host=tvxads-c5-c00034-b";
        SeleniumUtils.performQuery(path);
        ChartAvailableChecker.performCheck(1);
        SettingChecker.performCheck("-dataParam-", "c5c0appds");
        SettingChecker.performCheck("groupParamValue", "writeMinDataService");
        SettingChecker.performCheck("dataParamName", "95th Percentile");
        SettingChecker.performCheck("host", "tvxads-c5-c00034-b");

        path="/#/page/appds/appds_request_total?reload=false&dataParam=c5c0appds&groupParamValue=writeMinDataService&host=tvxads-c5-c00034-b";
        SeleniumUtils.performQuery(path);
        ChartAvailableChecker.performCheck(1);
        SettingChecker.performCheck("-dataParam-", "c5c0appds");
        SettingChecker.performCheck("groupParamValue", "writeMinDataService");
        SettingChecker.performCheck("host", "tvxads-c5-c00034-b");

        path="/#/page/appds/appds_error?reload=false&dataParam=c5c0appds&groupParamValue=writeMinDataService&host=tvxads-c5-c00034-b";
        SeleniumUtils.performQuery(path);
        ChartAvailableChecker.performCheck(1);
        SettingChecker.performCheck("-dataParam-", "c5c0appds");
        SettingChecker.performCheck("groupParamValue", "writeMinDataService");
        SettingChecker.performCheck("host", "tvxads-c5-c00034-b");

        path="/#/page/appds/appds_slow_request?reload=false&dataParam=c5c0appds&groupParamValue=writeMinDataService&host=tvxads-c5-c00034-b";
        SeleniumUtils.performQuery(path);
        ChartAvailableChecker.performCheck(1);
        SettingChecker.performCheck("-dataParam-", "c5c0appds");
        SettingChecker.performCheck("groupParamValue", "writeMinDataService");
        SettingChecker.performCheck("host", "tvxads-c5-c00034-b");

        path="/#/page/appds/appds_general?reload=false&dataParam=c5c0appds&groupParamValue=writeMinDataService&host=tvxads-c5-c00034-b&dataParamName=errCount";
        SeleniumUtils.performQuery(path);
        ChartAvailableChecker.performCheck(1);
        SettingChecker.performCheck("-dataParam-", "c5c0appds");
        SettingChecker.performCheck("groupParamValue", "writeMinDataService");
        SettingChecker.performCheck("host", "tvxads-c5-c00034-b");
        SettingChecker.performCheck("dataParamName", "Errors");

    }

    @Test
    public void verifyXRE_positive() {

        String path;

        path="/#/page/xre/connectionStates?reload=false&groupParam=IP_VERSION&dataParam=GUIDE_ERROR";
        SeleniumUtils.performQuery(path);
        ChartAvailableChecker.performCheck(1);
        SettingChecker.performCheck("groupParam", "IP version");
        SettingChecker.performCheck("dataParam", "GUIDE_ERROR");

        path="/#/page/xre/overlay_error?reload=false&groupParam=TLS_CONNECTION&dataParam=XRE-03097";
        SeleniumUtils.performQuery(path);
        ChartAvailableChecker.performCheck(1);
        SettingChecker.performCheck("groupParam", "Type of security");
        SettingChecker.performCheck("dataParam", "XRE-03097");

        path="/#/page/xre/tune_stat?reload=false&dataParam=Success&groupParam=IP_VERSION";
        SeleniumUtils.performQuery(path);
        ChartAvailableChecker.performCheck(1);
        SettingChecker.performCheck("groupParam", "IP version");
        SettingChecker.performCheck("dataParam", "Success");

        path="/#/page/xre/tune_success_rate?reload=false&groupParam=IP_VERSION";
        SeleniumUtils.performQuery(path);
        ChartAvailableChecker.performCheck(1);
        SettingChecker.performCheck("groupParam", "IP version");

        path="/#/page/xre/ui_state_totals?reload=false&dataParam=CHANNEL_LIST&groupParam=IP_VERSION";
        SeleniumUtils.performQuery(path);
        ChartAvailableChecker.performCheck(1);
        SettingChecker.performCheck("groupParam", "IP version");
        SettingChecker.performCheck("dataParam", "CHANNEL_LIST");

        path="/#/page/xre/scene_totals?reload=false&groupParam=IP_VERSION&dataParam=FULL_SCREEN";
        SeleniumUtils.performQuery(path);
        ChartAvailableChecker.performCheck(1);
        SettingChecker.performCheck("groupParam", "IP version");
        SettingChecker.performCheck("dataParam", "FULL_SCREEN");

        path="/#/page/xre/overlay_totals?reload=false&groupParam=IP_VERSION&dataParam=POWER_SAVE";
        SeleniumUtils.performQuery(path);
        ChartAvailableChecker.performCheck(1);
        SettingChecker.performCheck("groupParam", "IP version");
        SettingChecker.performCheck("dataParam", "POWER_SAVE");

        path="/#/page/xre/reconnects?reload=false&dataParam=ALL&groupParam=IP_VERSION";
        SeleniumUtils.performQuery(path);
        ChartAvailableChecker.performCheck(1);
        SettingChecker.performCheck("groupParam", "All");
        SettingChecker.performCheck("dataParam", "All");

    }

    @Test
    public void verifyXRE_negative() {

        String path;

        path="/#/page/xre/connectionStates?reload=false&groupParam=IP_VERSION1&dataParam=GUIDE_ERROR";
        SeleniumUtils.performQuery(path);
        ChartAvailableChecker.performCheck(1);
        SettingChecker.performCheck("groupParam", "All");
        SettingChecker.performCheck("dataParam", "GUIDE_COMPLETE");

        path="/#/page/xre/connectionStates?reload=false&groupParam=IP_VERSION1&dataParam=GUIDE_ERR3OR";
        SeleniumUtils.performQuery(path);
        ChartAvailableChecker.performCheck(1);
        SettingChecker.performCheck("groupParam", "All");
        SettingChecker.performCheck("dataParam", "GUIDE_COMPLETE");

        path="/#/page/xre/overlay_error?reload=false&groupParam=TLS_CONNE1CTION&dataParam=XRE-03097";
        SeleniumUtils.performQuery(path);
        ChartAvailableChecker.performCheck(1);
        SettingChecker.performCheck("groupParam", "All");
        SettingChecker.performCheck("dataParam", "All");

        path="/#/page/xre/overlay_error?reload=false&groupParam=TLS_CONNECTION&dataParam=XRE-030197";
        SeleniumUtils.performQuery(path);
        ChartAvailableChecker.performCheck(1);
        SettingChecker.performCheck("groupParam", "All");
        SettingChecker.performCheck("dataParam", "All");

        path="/#/page/xre/tune_stat?reload=false&dataParam=Suc1cess&groupParam=IP_VERSION";
        SeleniumUtils.performQuery(path);
        ChartAvailableChecker.performCheck(1);
        SettingChecker.performCheck("groupParam", "All");
        SettingChecker.performCheck("dataParam", "All");

        path="/#/page/xre/tune_stat?reload=false&dataParam=Success&groupParam=IP_VERSI1ON";
        SeleniumUtils.performQuery(path);
        ChartAvailableChecker.performCheck(1);
        SettingChecker.performCheck("groupParam", "All");
        SettingChecker.performCheck("dataParam", "All");

        path="/#/page/xre/tune_success_rate?reload=false&groupParam=IP_VE1RSION";
        SeleniumUtils.performQuery(path);
        ChartAvailableChecker.performCheck(1);
        SettingChecker.performCheck("groupParam", "All");


        path="/#/page/xre/ui_state_totals?reload=false&dataParam=CH1ANNEL_LIST&groupParam=IP_VERSION";
        SeleniumUtils.performQuery(path);
        ChartAvailableChecker.performCheck(1);
        SettingChecker.performCheck("groupParam", "All");
        SettingChecker.performCheck("dataParam", "All");

        path="/#/page/xre/ui_state_totals?reload=false&dataParam=CHANNEL_LIST&groupParam=IP_VERSI1ON";
        SeleniumUtils.performQuery(path);
        ChartAvailableChecker.performCheck(1);
        SettingChecker.performCheck("groupParam", "All");
        SettingChecker.performCheck("dataParam", "All");

        path="/#/page/xre/scene_totals?reload=false&groupParam=IP_VE1RSION&dataParam=FULL_SCREEN";
        SeleniumUtils.performQuery(path);
        ChartAvailableChecker.performCheck(1);
        SettingChecker.performCheck("groupParam", "All");
        SettingChecker.performCheck("dataParam", "All");

        path="/#/page/xre/scene_totals?reload=false&groupParam=IP_VERSION&dataParam=FULL_SCRE1EN";
        SeleniumUtils.performQuery(path);
        ChartAvailableChecker.performCheck(1);
        SettingChecker.performCheck("groupParam", "All");
        SettingChecker.performCheck("dataParam", "All");

        path="/#/page/xre/overlay_totals?reload=false&groupParam=IP_VERS1ION&dataParam=POWER_SAVE";
        SeleniumUtils.performQuery(path);
        ChartAvailableChecker.performCheck(1);
        SettingChecker.performCheck("groupParam", "All");
        SettingChecker.performCheck("dataParam", "All");

        path="/#/page/xre/overlay_totals?reload=false&groupParam=IP_VERSION&dataParam=POWER_SA1VE";
        SeleniumUtils.performQuery(path);
        ChartAvailableChecker.performCheck(1);
        SettingChecker.performCheck("groupParam", "All");
        SettingChecker.performCheck("dataParam", "All");

    }
}
