package project.GetAWork.dataAccess.abstratcs;

import org.hibernate.boot.archive.internal.JarProtocolArchiveDescriptor;
import org.springframework.data.jpa.repository.JpaRepository;
import project.GetAWork.entities.concretes.Candidate;

public interface CandidateDao extends JpaRepository<Candidate,Integer> {
}
