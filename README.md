# boudis
<img src="boudis.png">
using java swing and java graphics to represent a network topology inside a jpanel

you can find an example and some screenshots and the jar file on this website <a href="http://devgeeks.site/2017/06/22/boudis-a-java-swing-based-library-to-display-and-view-network-topologies/">devgeeks.site</a>

#### usage
```java
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
    
    ```
    
