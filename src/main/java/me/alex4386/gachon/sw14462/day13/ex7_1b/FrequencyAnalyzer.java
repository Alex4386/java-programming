package me.alex4386.gachon.sw14462.day13.ex7_1b;

public class FrequencyAnalyzer {
    private String input;
    private int[] frequency;

    public FrequencyAnalyzer(String input) {
        this.input = input;
        this.frequency = new int[10];

        this.analyze();
    }

    public void setInput(String input) {
        this.reset();
        this.input = input;
        this.analyze();
    }

    private void reset() {
        // reuse the array, but initialize to 0
        for (int i = 0; i < this.frequency.length; i++) {
            this.frequency[i] = 0;
        }
    }

    public int[] getFrequency() {
        return this.frequency;
    }

    private void analyze() {
        // split to each character
        String[] characters = this.input.split("");

        // count frequency
        for (String character : characters) {
            try {
                int number = Integer.parseInt(character);
                this.frequency[number]++;
            } catch (NumberFormatException e) {
                // ignore
            }
        }
    }
}
