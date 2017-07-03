package tech.orchi.sandbox.uaisensors;

public class SensorStatus {
	private String sensorId;
	private double sensorValue;
	private double previousAverage;
	
	public SensorStatus(String sensorId, double sensorValue, double previousAverage) {
		super();
		this.sensorId = sensorId;
		this.sensorValue = sensorValue;
		this.previousAverage = previousAverage;
	}
	public String getSensorId() {
		return sensorId;
	}
	public void setSensorId(String sensorId) {
		this.sensorId = sensorId;
	}
	public double getSensorValue() {
		return sensorValue;
	}
	public void setSensorValue(double sensorValue) {
		this.sensorValue = sensorValue;
	}
	public double getPreviousAverage() {
		return previousAverage;
	}
	public void setPreviousAverage(double previousAverage) {
		this.previousAverage = previousAverage;
	}
	
	@Override
	public String toString() {
		return "SensorStatus [sensorId=" + sensorId + ", sensorValue=" + sensorValue + ", previousAverage="
				+ previousAverage + "]";
	}
	
}
