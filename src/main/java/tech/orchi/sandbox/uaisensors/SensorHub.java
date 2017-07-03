package tech.orchi.sandbox.uaisensors;

public class SensorHub {

	private double sum = 0.0;
	private int count = 0;
	
	private SensorStatusSink exceededSensorStatusSink;
	
	public void setExceededSensorStatusSink(SensorStatusSink sensorStatusSink) {
		this.exceededSensorStatusSink = sensorStatusSink;
	}
	
	/**
	 * Accept sensor report. Fire exceeded status report if the value exceeds average more than twice.
	 * @param sensorId
	 * @param value
	 */
	public void report(String sensorId, double value) {
		
		double previousAverage = count > 0 ? sum / count : value;
		
		sum += value;
		count++;
		
		SensorStatus status = new SensorStatus(sensorId, value, previousAverage);
		if (count > 0 && value > 2 * previousAverage) {
			exceededSensorStatusSink.report(status);
		}
	}
	
}
