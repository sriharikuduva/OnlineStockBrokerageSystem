import metadata.OrderStatus;
import metadata.TimeEnforcementType;

import java.util.Date;

public abstract class Order {
    private String orderNumber;
    public boolean isBuyOrder;
    private OrderStatus status;
    private TimeEnforcementType timeEnforcement;
    private Date creationTime;

    private HashMap<Integer, OrderPart> parts;

    public void setStatus(OrderStatus status){
        this.status = status;
    }

    public boolean saveInDB() {
        // save in the database
    }

    public void addOrderParts(OrderParts parts) {
        for (OrderPart part : parts) {
            this.parts.put(part.id, part);
        }
    }
}