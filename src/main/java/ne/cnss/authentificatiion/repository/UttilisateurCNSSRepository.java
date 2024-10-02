package ne.cnss.authentificatiion.repository;

import ne.cnss.authentificatiion.model.UtilisateurCNSS;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UttilisateurCNSSRepository extends JpaRepository<UtilisateurCNSS, Integer> {

    public UtilisateurCNSS findByMatricule(String matricule);
}
