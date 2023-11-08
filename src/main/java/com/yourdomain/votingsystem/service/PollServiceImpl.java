package com.yourdomain.votingsystem.service;

import com.yourdomain.votingsystem.dto.PollDto;
import com.yourdomain.votingsystem.dto.VoteDto;
import org.springframework.stereotype.Service;

@Service
public class PollServiceImpl implements PollService {

    @Override
    public void createPoll(PollDto pollDto) {
    }

    @Override
    public void castVote(Long pollId, VoteDto voteDto) {
    }

    @Override
    public PollDto getPollById(Long pollId) {
        return new PollDto();
    }

    @Override
    public Object getPollResults(Long pollId) {
        return new Object();
    }
}
