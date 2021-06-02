public class Climber {
    private int max_height;
    private int difference3_step;
    private int length;

    public int getMax_height() {
        return max_height;
    }
    public void setMax_height(int max_height) {
        this.max_height = max_height;
    }
    public int getDifference3_step() {
        return difference3_step;
    }
    public void setDifference3_step(int difference3_step) {
        // Если максимальный перепад 3 ближайших вершин > max, то ограничить максимальной вершиной
        if (difference3_step < max_height) {
            this.difference3_step = difference3_step;
        }
        else {
            this.difference3_step = max_height;
        }
    }
    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        if (length > 3) {
            this.length = length;
        } else {
            System.out.println("Путь не может быть < 3 вершин!");
        }
    }
}