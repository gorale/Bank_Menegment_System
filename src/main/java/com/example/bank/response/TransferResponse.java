package com.example.bank.response;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class TransferResponse<T> {

    public ResponseEntity<?> onFailure() {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Transfer with given params does not exist.");
    }

    public ResponseEntity<?> onSuccess() {
        return ResponseEntity.ok().body("Successfully money transfer.");
    }

    public ResponseEntity<?> insufficientAmount() {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Insufficient funds in the account.");
    }

    public ResponseEntity<?> incorrectAccount() {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Wrong account number in request.");
    }

    public ResponseEntity<?> incorrectCardNumber() {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Wrong card number in request.");
    }

    public ResponseEntity<?> blockedCard() {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Selected card is not active.");
    }
}
