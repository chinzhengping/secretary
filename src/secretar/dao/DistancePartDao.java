/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package secretar.dao;

import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import secretar.objects.DistancePart;
import secretar.objects.Team;

/**
 *
 * @author Степан
 */
@Transactional(propagation = Propagation.REQUIRED)
public interface DistancePartDao extends GenericDao<DistancePart, Long>{

    List<DistancePart> findByTeam(Team team);

    DistancePart findByVisibleNumber(String visibleNumber);

}
