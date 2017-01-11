/**
 * 
 */
package xyz.shanmugavel.creational.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Shanmugavel_S01
 *
 */
public abstract class Base implements Cloneable, Serializable {

	private static final Logger LOG = LoggerFactory.getLogger(Base.class);
	
	private static final long serialVersionUID = 1L;

	@Override
	protected Base clone() throws CloneNotSupportedException {
		Base clonedCopy = null;
		try {		
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(baos);
			oos.writeObject(this);
			
			ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
			ObjectInputStream ois = new ObjectInputStream(bais);
			clonedCopy = (Base) ois.readObject();
		} catch (IOException | ClassNotFoundException exception) {
			LOG.error("ERROR MSG={}", exception.getMessage());
		}
		return clonedCopy;
	}

	
}
