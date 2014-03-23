package exemplo.entity;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Carro.class)
public abstract class Carro_ {

	public static volatile SingularAttribute<Carro, Long> id;
	public static volatile SingularAttribute<Carro, String> placa;

}

