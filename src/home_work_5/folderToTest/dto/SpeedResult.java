package home_work_5.folderToTest.dto;

public class SpeedResult {
    private Sample add;
    private Sample sort;
    private Sample iter;
    private Sample remove;

    public SpeedResult(Sample add, Sample sort, Sample iter, Sample remove) {
        this.add = add;
        this.sort = sort;
        this.iter = iter;
        this.remove = remove;
    }

    public long getTimeAdd() {
        return add.getTime();
    }

    public long getTimeSort() {
        return sort.getTime();
    }

    public long getTimeIter() {
        return iter.getTime();
    }

    public long getTimeRemove() {
        return remove.getTime();
    }

    /**
     * внутренний стат класс для отображения результатов спидтеста
     */
    public static class Sample {
        private long start;
        private long stop;

        public Sample(long start, long stop) {
            this.start = start;
            this.stop = stop;
        }

        public long getStart() {
            return start;
        }

        public long getStop() {
            return stop;
        }

        public long getTime() {
            return stop - start;
        }
    }
}
