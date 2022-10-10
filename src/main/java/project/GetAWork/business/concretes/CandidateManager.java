package project.GetAWork.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.GetAWork.business.abstratcs.CandidateService;
import project.GetAWork.dataAccess.abstratcs.CandidateDao;
import project.GetAWork.entities.concretes.Candidate;

import java.util.List;

@Service
public class CandidateManager implements CandidateService {
    private CandidateDao candidateDao;
    @Autowired
    public CandidateManager(CandidateDao candidateDao){

        this.candidateDao=candidateDao;
    }
    @Override
    public List<Candidate> getAll() {
        return this.candidateDao.findAll();
    }
}
