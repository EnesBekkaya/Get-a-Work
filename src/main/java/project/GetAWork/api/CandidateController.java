package project.GetAWork.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.GetAWork.business.abstratcs.CandidateService;
import project.GetAWork.entities.concretes.Candidate;

import java.util.List;

@RestController
@RequestMapping("/candidate")
public class CandidateController {
    private CandidateService candidateService;
    @Autowired
    public CandidateController(CandidateService candidateService){
        this.candidateService=candidateService;
    }
    @GetMapping("/getAll")
    public List<Candidate> getAll(){
        return this.candidateService.getAll();
    }
}
