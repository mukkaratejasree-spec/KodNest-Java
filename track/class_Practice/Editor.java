package track.class_Practice;
class Editor {
    void change(int[] data) {
        data[1] = 50; // Mutates the original array

        data = new int[2]; // Reassigns the local parameter
        data[0] = 99; // Changes the new array
    }

    public static void main(String[] args) {
        int[] values = { 10, 20 };

        Editor editor = new Editor();
        editor.change(values);

        System.out.println(values[0] + " " + values[1]);
    }
}