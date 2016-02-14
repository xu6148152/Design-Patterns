package bristol.zepp.com.async_method_invocation;

/**
 * Created by xubinggui on 2/14/16.
 */
public interface AsyncCallback<T> {
    /**
     * Complete handler which is executed when async task is completed or fails execution.
     *
     * @param value the evaluated value from async task, undefined when execution fails
     * @param ex empty value if execution succeeds, some exception if executions fails
     */
    void onComplete(T value, Exception ex);
}
