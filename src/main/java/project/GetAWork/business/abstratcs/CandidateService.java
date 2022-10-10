package project.GetAWork.business.abstratcs;

import project.GetAWork.entities.concretes.Candidate;

import java.util.List;

public interface CandidateService {
     List<Candidate> getAll();
}
