package com.enonic.app.googlesearch;

import com.google.auth.oauth2.AccessToken;

import com.enonic.xp.script.serializer.MapGenerator;
import com.enonic.xp.script.serializer.MapSerializable;

public class AccessTokenMapper
    implements MapSerializable
{
    private final AccessToken value;

    public AccessTokenMapper( final AccessToken value )
    {
        this.value = value;
    }

    @Override
    public void serialize( final MapGenerator g )
    {
        g.value( "token", this.value.getTokenValue() );
        g.value( "expires", this.value.getExpirationTime().getTime() );
    }
}
