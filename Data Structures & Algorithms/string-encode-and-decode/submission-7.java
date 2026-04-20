class Solution {

    public String encode(List<String> strs) {
        if(strs.isEmpty())
            return null;
        return String.join(";",strs);
    }

    public List<String> decode(String str) {
        if(str == null)
            return new ArrayList<>();
        else if(str == "")
            return new ArrayList<>(Arrays.asList(""));
        String[] strs = str.split(";");
        return new ArrayList<>(Arrays.stream(strs).toList());
    }
}
