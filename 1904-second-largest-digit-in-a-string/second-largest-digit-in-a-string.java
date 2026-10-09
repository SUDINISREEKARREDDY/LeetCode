class Solution {
    public int secondHighest(String s) {
        StringBuilder digits = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                digits.append(ch);
            }
        }
        char[] arr = digits.toString().toCharArray();
        Arrays.sort(arr);
        int largest = -1;
            for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] != largest) {
                if (largest != -1) {
                    return arr[i] - '0';
                }
                largest = arr[i];
            }
        }
        return -1;

    }
}