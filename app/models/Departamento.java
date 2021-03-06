package models;

import java.util.*;
import javax.persistence.*;

import play.db.ebean.*;
import play.data.format.*;
import play.data.validation.*;

import com.avaje.ebean.*;

@Entity

public class Departamento extends Model{

	@Id
	public Long id;

	@Constraints.Required
	public String nombre;
	

   public static Finder<Long, Departamento> find = new Finder<Long,Departamento>(Departamento.class);
   
  
    public static Map<String,String> options(){
	  	LinkedHashMap<String,String> options = new LinkedHashMap<String,String>();
	  		  	for(Departamento c : Departamento.find.orderBy("nombre").findList()){
	  		options.put(c.id.toString(), c.nombre);
	  	}
	  	return options;
  	}

	
}//fin clase