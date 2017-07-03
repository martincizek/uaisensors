package tech.orchi.sandbox.uaisensors;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {
    		SensorHub hub = new SensorHub();
    		hub.setExceededSensorStatusSink(new SensorStatusSink() {

				public void report(SensorStatus status) {
					System.out.println(status);
				}
    		});
    		double value;
    		Scanner scanner = new Scanner(System.in);
    		while ((value = scanner.nextDouble()) >= 0) {
    			hub.report("xxx", value);
    		}
    		scanner.close();
    }
}
