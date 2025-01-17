package org.nhl.containing_backend.communication.messages;

import org.nhl.containing_backend.models.Container;
import org.nhl.containing_backend.vehicles.Transporter;

/**
 *
 */
public class CreateMessage extends Message {

    private Transporter transporter;

    public CreateMessage(Transporter transporter) {
        super(Message.CREATE);
        this.transporter = transporter;
    }

    @Override
    public String generateXml() {
        String message = "";
        message += "<id>" + getId() + "</id>";
        message += "<Create>";
        message += "<Transporter type=\"" + transporter.getType() + "\" identifier=\"" + transporter.getId() +"\">";

        for (Container container : transporter.getContainers()) {
            message += container.toXml();
        }

        message += "</Transporter>";
        message += "</Create>";

        return message;
    }

    public Transporter getTransporter() {
        return transporter;
    }
}
