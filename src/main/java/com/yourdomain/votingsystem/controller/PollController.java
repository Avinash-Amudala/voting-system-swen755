package com.yourdomain.votingsystem.controller;

import com.yourdomain.votingsystem.dto.PollDto;
import com.yourdomain.votingsystem.dto.VoteDto;
import com.yourdomain.votingsystem.service.PollService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/polls")
public class PollController {

    @Autowired
    private PollService pollService;

    @PostMapping
    @PreAuthorize("hasAuthority('CREATE_POLL')")
    public ResponseEntity<?> createPoll(@RequestBody PollDto pollDto) {
        // Implement poll creation logic
        pollService.createPoll(pollDto);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/{pollId}/votes")
    public ResponseEntity<?> castVote(@PathVariable Long pollId, @RequestBody VoteDto voteDto) {
        // Implement voting logic
        pollService.castVote(pollId, voteDto);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{pollId}")
    public ResponseEntity<PollDto> getPollById(@PathVariable Long pollId) {
        // Implement logic to get a poll by its ID
        PollDto pollDto = pollService.getPollById(pollId);
        return ResponseEntity.ok(pollDto);
    }

    @GetMapping("/{pollId}/results")
    public ResponseEntity<?> getPollResults(@PathVariable Long pollId) {
        // Implement logic to get poll results
        Object pollResults = pollService.getPollResults(pollId);
        return ResponseEntity.ok(pollResults);
    }
}
