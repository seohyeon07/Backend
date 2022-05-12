package com.j.bizcard.web;

import com.j.bizcard.domain.BizCard;
import com.j.bizcard.domain.BizCardRepository;
import com.j.bizcard.web.dto.BizCardSaveDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class BizCardController {
    private final BizCardRepository bizcardRepository;

    @PutMapping("/bizcard/{id}")
    public void update(@RequestBody BizCardSaveDto dto, @PathVariable String id) {
        BizCard bizCard = dto.toEntity();
        bizCard.set_id(id);

        bizcardRepository.save(bizCard);
    }

    @DeleteMapping("/bizcard/{id}")
    public int deleteById(@PathVariable String id) {
        bizcardRepository.deleteById(id);
        return 1;
    }

    @GetMapping("/bizcard")
    public List<BizCard> findAll() {
        return bizcardRepository.findAll();
    }

    @GetMapping("/bizcard/{id}")
    public BizCard findById(@PathVariable String id) {
        return bizcardRepository.findById(id).get();
    }

    @PostMapping("/bizcard")
    public BizCard save(@RequestBody BizCardSaveDto dto) {
        BizCard bizCardEntity = bizcardRepository.save(dto.toEntity());
        return bizCardEntity;
    }
}
