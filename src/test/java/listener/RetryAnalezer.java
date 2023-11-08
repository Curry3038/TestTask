package listener;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalezer implements IRetryAnalyzer {

    private int retryCount=0;
    private static final int maxRetryAnalezer=3;

    @Override
    public boolean retry(ITestResult result){
        if (retryCount<maxRetryAnalezer){
            retryCount++;
            return true;
        }
        return false;
    }
}
