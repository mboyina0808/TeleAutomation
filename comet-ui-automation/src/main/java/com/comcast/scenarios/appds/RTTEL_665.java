package com.comcast.scenarios.appds;

import com.comcast.SeleniumUtils;
import com.comcast.checkers.ChartAvailableChecker;
import com.comcast.checkers.OptionsCountChecker;
import org.junit.Test;

public class RTTEL_665 {

    @Test
    public void checkOptionsCount() {
        String path;
        path="/#/page/appds/appds_request_duration";
        SeleniumUtils.performQuery(path);
        OptionsCountChecker.performCheck("-dataParam-", 2);
        OptionsCountChecker.performCheck("-groupParamValue-", 2);
        OptionsCountChecker.performCheck("-filterValue-", 2);
        OptionsCountChecker.performCheck("-percentileName-", 2);

        path="/#/page/appds/appds_request_total";
        SeleniumUtils.performQuery(path);
        OptionsCountChecker.performCheck("-dataParam-", 2);
        OptionsCountChecker.performCheck("-groupParamValue-", 2);
        OptionsCountChecker.performCheck("-filterValue-", 2);

        path="/#/page/appds/appds_error";
        SeleniumUtils.performQuery(path);
        OptionsCountChecker.performCheck("-dataParam-", 2);
        OptionsCountChecker.performCheck("-groupParamValue-", 2);
        OptionsCountChecker.performCheck("-filterValue-", 2);

        path="/#/page/appds/appds_slow_request";
        SeleniumUtils.performQuery(path);
        OptionsCountChecker.performCheck("-dataParam-", 2);
        OptionsCountChecker.performCheck("-groupParamValue-", 2);
        OptionsCountChecker.performCheck("-filterValue-", 2);

        path="/#/page/appds/appds_general";
        SeleniumUtils.performQuery(path);
        OptionsCountChecker.performCheck("-dataParam-", 2);
        OptionsCountChecker.performCheck("-groupParamValue-", 2);
        OptionsCountChecker.performCheck("-filterValue-", 2);
    }

    @Test
    public void checkChartAvailable() {
        String path;
        path="/#/page/appds/appds_request_duration";
        SeleniumUtils.performQuery(path);
        ChartAvailableChecker.performCheck(1);

        path="/#/page/appds/appds_request_total";
        SeleniumUtils.performQuery(path);
        ChartAvailableChecker.performCheck(1);

        path="/#/page/appds/appds_error";
        SeleniumUtils.performQuery(path);
        ChartAvailableChecker.performCheck(1);

        path="/#/page/appds/appds_slow_request";
        SeleniumUtils.performQuery(path);
        ChartAvailableChecker.performCheck(1);

        path="/#/page/appds/appds_general";
        SeleniumUtils.performQuery(path);
        ChartAvailableChecker.performCheck(1);
    }
}
