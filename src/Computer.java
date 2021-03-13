
public class Computer implements ComputerOperations{
	private String className = "";
	
	public Computer() {
		this.className = "Computer";
	}
	
	public void setClassName(String className) {
		this.className = className;
	}

	public String getClassName() {
		return className;
	}
	
	public void turnOn() {
		System.out.println(getClassName() + " is now turned on!");
	}

	
	public void turnoff() {
		System.out.println(getClassName() + " is now turned off!");
	}

	
	public void performDownload() {
		System.out.println(getClassName() + " the file is downloading!");
	}

	
	public void performUpload() {
		System.out.println(getClassName() + " the file is uploading!");
	}

	
	public void playVideo() {
		System.out.println(getClassName() + " is now playing a video!");
	}

	
	public void playMusic() {
		System.out.println(getClassName() + " the music file is playing!");
	}

}
