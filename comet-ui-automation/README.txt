How to configure ui automation tests?

1. Go to: https://sites.google.com/a/chromium.org/chromedriver/downloads

2. Download and install driver for proper platform.

3. Go to your IDE settings and configure environment next way:
-Dwebdriver.chrome.driver={path_to_your_chrome_driver} -Dcomet.url={comet_host_and_port}

For example:
-Dwebdriver.chrome.driver=/Users/oleksii/chromedriver -Dcomet.url=tvxmui-do-c00001-b.do.xcal.tv:8099

4. Run application and enjoy)
