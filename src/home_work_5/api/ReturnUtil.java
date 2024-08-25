package home_work_5.api;

public class ReturnUtil<T> {
    private T result;
    private long duration;

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    public long getDuration() {
        return duration;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }

    public ReturnUtil(T result, long duration) {
        this.result = result;
        this.duration = duration;
    }
}
