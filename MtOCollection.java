package ManyToOne;



import java.util.Collection;
import java.util.Scanner;

import org.apache.commons.collections.map.MultiValueMap;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import com.google.common.collect.*;








public class MtOCollection extends MultiValueMap  {

	public boolean containsSource(Object source){
		if (this.containsValue(source)) {
		System.out.println(this.containsValue(source));	
		}
		return false;
	}
	
	public boolean containsTarget(String target){
		if (this.containsKey(target)) {
		System.out.println(true);	
		}
		return false;
	}
	
	public Collection<Object> getSources(String target){
		if(this.containsTarget(target)){	
	java.util.Iterator<Object> itr =  this.iterator(target);
	while(itr.hasNext()){
	Object el = itr.next();
	System.out.println("Value for this key is: " + el);	
	}
	}
	 return this.getCollection(target);	
		
	}
	
	public void disconnect(String target){
		if (containsTarget(target)) {
			this.remove(target);
			System.out.println("Item was removed");	
		}
		else{
		System.out.println("The target is not in the Collection.");	
		}
	}
	
	public Collection<String> getTargets() {
		return this.keySet();
	}
	
	public boolean connect(){
		String theKey;
		Scanner input = new Scanner(System.in);
		Scanner str = new Scanner(input.nextLine());
		System.out.print("Please enter values for target and source: ");
		 theKey= str.next();
		 while(str.hasNext()){
		if (str.hasNextInt()) {
		this.put(theKey, str.nextInt());	
		break;
		}
		else if(str.hasNextDouble()){
			this.put(theKey, str.nextDouble());	
			break;
		}
		else if (str.hasNextBoolean()) {
			this.put(theKey, str.nextBoolean());	
			break;	
		}
		else {
			this.put(theKey, str.next());	
			break;	
		}
		}
		str.close();
		input.close();
		System.out.println("The items have been connected.");
		return true;	
		
	}
	
	
	public boolean connect(Object source, String target){
		
		this.put(target, source);
		System.out.println("The items have been connected.");
		return true;
		}

	
	@Override
	public int hashCode(){
		return new HashCodeBuilder(17,31).appendSuper(super.hashCode()).toHashCode();
		
	}
	
	@Override
	public boolean equals(Object obj){
		if(obj == null) return false;
		 if (obj == this) {
		return true;	
		}
	MtOCollection rhs = (MtOCollection) obj;
	return new EqualsBuilder().appendSuper(super.equals(obj)).isEquals();
	}
		

}
