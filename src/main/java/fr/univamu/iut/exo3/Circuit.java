package fr.univamu.iut.exo3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * A circuit class using the composite pattern, can be treated as a component most of the time
 * @author b20004609
 *
 */
public class Circuit extends Component {
	
	private ArrayList<Component> components;
	
	public Circuit() {
		this((Component[]) null); //Let's forget this.
	}
	
	public Circuit(Component... components) {
		this.components = new ArrayList<>();
		Collections.addAll(this.components, components);
	}

	@Override
	public void execute() {
		for(Component component : components) {
			component.execute();
		}
	}
	
	
	/* GETTERS / SETTERS */
	
	/**
	 * @param index The index of the components
	 * @return The component if available, null otherwise
	 */
	public Component getComponent(int index) {
		if (index < 0 || index >= components.size()) return null;
		return components.get(index);
	}
	
	public void addComponent(Component component) {
		this.components.add(component);
	}
	
	public void removeComponent(Component component) {
		this.components.remove(component);
	}

}
