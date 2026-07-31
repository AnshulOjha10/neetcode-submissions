class TimeMap {
    class info {
        int timeStamp;
        String value;

        info(int timeStamp, String value) {
            this.timeStamp = timeStamp;
            this.value = value;
        }
    }

    HashMap<String, ArrayList<info>> map;

    public TimeMap() {
        map = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        if (!map.containsKey(key)) {
            map.put(key, new ArrayList<info>());
        }

        map.get(key).add(new info(timestamp, value));
    }

    public String get(String key, int timestamp) {
        if (!map.containsKey(key)) {
            return "";
        }

        ArrayList <info> list = map.get(key);

        return BinarySearch(list, timestamp);
    }

    public String BinarySearch(ArrayList<info> list, int time) {
        int start = 0;
        int end = list.size() - 1;
        String ans = "";

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (list.get(mid).timeStamp <= time) {
                ans = list.get(mid).value;
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }

        return ans;
    }
}
