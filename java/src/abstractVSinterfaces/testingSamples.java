package abstractVSinterfaces;

public class testingSamples extends sampleIntArray implements interfaceSample, interfaceTwo {

    @Override
    public void testingSamples() {
        int[] sample = sampleIntArray.intArrFiveElements();

        for (int i=0; i<10; i++) {
            System.out.printf("Accessing element %d in array ... %n", i);
            try {
                System.out.printf("Element is %d %n", sample[i]);
            } catch (Exception e) {
                System.out.printf("%s %n", e.getMessage());
            }
        }
    }

    @Override
    public void redundant() {
        System.out.println("I am a redundant function to show I can use interfaces :D");
    }
}
