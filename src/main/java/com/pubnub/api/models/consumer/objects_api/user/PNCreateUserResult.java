package com.pubnub.api.models.consumer.objects_api.user;


import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class PNCreateUserResult {

    private PNUser user;
}
