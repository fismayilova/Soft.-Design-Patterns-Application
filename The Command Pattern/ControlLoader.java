package Lab6;

public class ControlLoader {

	public static void main(String[] args) {
		WheatherAppControlWithUndo control = new WheatherAppControlWithUndo();
		Geolocation loc = new Geolocation("Geolocation");
		Account acc = new Account();

		AccountLogIn logIn = new AccountLogIn(acc);
		AccountLogOut logOut = new AccountLogOut(acc);
		EnterLocationCommand enter = new EnterLocationCommand(loc);
		GetLocationAutoCommand auto = new GetLocationAutoCommand(loc);

		control.setCommand(0, enter, auto); // seting commands
		control.UpdateButtonWasPushed(0);
		control.RestoreButtonWasPushed(0);
		control.undoButtonWasPushed();
		control.RestoreButtonWasPushed(0);
		control.UpdateButtonWasPushed(0);
		control.undoButtonWasPushed();
		System.out.println(control);
		control.setCommand(1, logIn, logOut); // seting new commands
		control.UpdateButtonWasPushed(1);
		control.RestoreButtonWasPushed(1);
		control.undoButtonWasPushed();
		control.UpdateButtonWasPushed(1);
		control.undoButtonWasPushed();
		control.UpdateButtonWasPushed(1);
		System.out.println(control);
		
		WheatherAppControl wac = new WheatherAppControl();
		wac.setCommand(logIn);
		wac.buttonWasPressed();
	}
}