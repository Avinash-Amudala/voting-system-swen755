package com.yourdomain.votingsystem.service;

import com.yourdomain.votingsystem.dto.PollDto;
import com.yourdomain.votingsystem.dto.VoteDto;

public interface PollService {
    void createPoll(PollDto pollDto);
    void castVote(Long pollId, VoteDto voteDto);
    PollDto getPollById(Long pollId);
    Object getPollResults(Long pollId);
}
