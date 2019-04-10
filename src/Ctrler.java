
public class Ctrler {
	View _gUI = null;
	Model _mdl = null;
	
	public Ctrler() {
		System.out.println("inside Controller constructor WOJ project");
		_gUI = new View();
		_mdl = new Model();
		
	}
	
	public int initProgr() {
		_gUI.initView();
		
		return 0;
	}
	
}
