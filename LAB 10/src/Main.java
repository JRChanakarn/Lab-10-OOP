import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.DateTime;
import org.eclipse.wb.swt.SWTResourceManager;

public class Main {

	protected Shell shell;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Main window = new Main();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(496, 371);
		shell.setText("SWT Application");
		
		Button Normal = new Button(shell, SWT.NONE);
		Normal.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		Normal.setBounds(54, 177, 165, 72);
		Normal.setText("Normal");
		
		Button Alert = new Button(shell, SWT.NONE);
		Alert.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		Alert.setText("Alert");
		Alert.setBounds(266, 177, 159, 72);
		
		Button Countdown = new Button(shell, SWT.NONE);
		Countdown.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		Countdown.setText("Countdown");
		Countdown.setBounds(54, 255, 165, 72);
		
		Button Stop = new Button(shell, SWT.NONE);
		Stop.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		Stop.setText("Stop");
		Stop.setBounds(266, 255, 159, 72);
		
		Composite composite = new Composite(shell, SWT.NONE);
		composite.setBounds(39, 27, 423, 133);
		
		Label lblHour = new Label(composite, SWT.NONE);
		lblHour.setBounds(110, 27, 30, 22);
		lblHour.setText("Hour");
		
		Label lblMinute = new Label(composite, SWT.NONE);
		lblMinute.setText("Minute");
		lblMinute.setBounds(173, 27, 58, 22);
		
		Label lblSecond = new Label(composite, SWT.NONE);
		lblSecond.setBounds(250, 27, 59, 14);
		lblSecond.setText("Second");
		
		DateTime dateTime = new DateTime(composite, SWT.TIME | SWT.LONG);
		dateTime.setFont(SWTResourceManager.getFont(".AppleSystemUIFont", 52, SWT.NORMAL));
		dateTime.setBounds(84, 47, 262, 76);

	}
}
