package com.example.restservice;

@RestController
public class MonsterController {
  @GetMapping("/monster")
  public Monster monster(
    @RequestParam(value = "id") String id) {
      return new Monster(id);
    }
}

