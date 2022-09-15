package AirPlaneFactoryPackage;
import PlanePackage.*;

public class AirPlaneFactory 
{
public static AbstractPlane createAbstractPlane (AirplaneType type) 
{
	AbstractPlane plane = switch (type) {
		case REGULAR_FLIGHT -> new RegularFlight();
		case LOWCOST -> new Lowcost();
		case MILITARYCARGO -> new MilitaryCargo();
		case MILITARYCIVIL -> new MilitaryCivil();
	};

	return plane;
}
}

