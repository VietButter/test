package kickstart.person;

import org.salespointframework.core.SalespointRepository;

public interface KundenRepository extends SalespointRepository<Kunde, Long> {
	public Kunde findByName(String name);
}
