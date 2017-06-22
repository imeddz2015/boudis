import java.awt.Color;
import java.awt.EventQueue;
 
import javax.swing.JFrame;
import javax.swing.border.EmptyBorder;
 
import com.nettopo.boudis.GraphicNode;
import com.nettopo.boudis.TopologyPanel;
import com.nettopo.boudis.WireX;
import com.nettopo.boudis.constants;
import com.nettopo.boudis.movableComponent;
 
public class mainWindow extends JFrame {
 
	private TopologyPanel contentPane; 
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainWindow frame = new mainWindow();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});		 
	} 
 
	public mainWindow() { 
		
		//define the text height in the topology labels
		int textheight = 15 ; //pixels
		constants.midVerticalText = textheight ;
		 
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 935, 525);
		contentPane = new TopologyPanel();
		contentPane.setBackground(new Color(169, 169, 169));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);	 
		contentPane.setLayout(null);
		
		movableComponent b2d =   GraphicNode.createNode("pc1",  100, 100, 200, 52) ;  
		movableComponent b1d =   GraphicNode.createNode("pc2",  300, 100 , 200, 52) ;  
		movableComponent b3d =   GraphicNode.createNode("pc3",  100, 300 , 200, 52) ;  		
		movableComponent b4d =   GraphicNode.createNode("pc4",  600, 250 , 200, 52) ;
		movableComponent b5d =   GraphicNode.createNode("pc5",  300, 400 , 200, 52) ;
		
		WireX wr1 = new WireX(b2d,b1d,"192.168.1.23","192.168.1.25","up") ; 
		WireX wr3 = new WireX(b1d,b3d,"192.168.1.21","192.168.1.63","up") ;
		WireX wr4 = new WireX(b1d,b4d,"192.168.1.22","192.168.1.58","down") ; 
		WireX wr6 = new WireX(b3d,b4d,"192.168.1.24","192.168.1.78","down") ;
		WireX wr7 = new WireX(b3d,b5d,"192.168.1.27","192.168.1.56","up") ;
		
		contentPane.add(b1d);
		contentPane.add(b2d);
		contentPane.add(b3d);
		contentPane.add(b4d);
		contentPane.add(b5d);
		   
		contentPane. addWire(wr1); 
		contentPane. addWire(wr3);
		contentPane. addWire(wr4); 
		contentPane. addWire(wr6);
		contentPane. addWire(wr7);
	 			 
		
	}
	
	
	
	
}
