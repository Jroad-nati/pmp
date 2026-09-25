package com.pmp.backend.item;

import java.time.OffsetDateTime;

public record ItemResponse(
        Long id,
        String name,
        String description,
        OffsetDateTime createdAt
) {
}
