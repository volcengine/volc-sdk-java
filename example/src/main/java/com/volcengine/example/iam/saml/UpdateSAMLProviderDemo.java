package com.volcengine.example.iam.saml;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.request.iam.UpdateSAMLProviderRequest;
import com.volcengine.model.response.iam.UpdateSAMLProviderResponse;
import com.volcengine.service.iam.IIamService;
import com.volcengine.service.iam.impl.IamServiceImpl;

public class UpdateSAMLProviderDemo {

    public static void main(String[] args) {
        IIamService iamService = IamServiceImpl.getInstance();
        // call below method if you dont set ak and sk in ～/.volc/config

        iamService.setAccessKey("Your AK");
        iamService.setSecretKey("Your SK");
        // list users
        try {
            UpdateSAMLProviderRequest request = UpdateSAMLProviderRequest.builder().
                    SAMLProviderName("provider_name").
                    newEncodedSAMLMetadataDocument("PEVudGl0eURlc2NyaXB0b3IgeG1sbnM9InVybjpvYXNpczpuYW1lczp0YzpTQU1MOjIuMDptZXRhZGF0YSIgdmFsaWRVbnRpbD0iMjAyMi0xMi0xMlQxNzoxOTo0Mi4yNDZaIiBlbnRpdHlJRD0idGVzdElEUCI+CiAgPElEUFNTT0Rlc2NyaXB0b3IgeG1sbnM9InVybjpvYXNpczpuYW1lczp0YzpTQU1MOjIuMDptZXRhZGF0YSIgcHJvdG9jb2xTdXBwb3J0RW51bWVyYXRpb249InVybjpvYXNpczpuYW1lczp0YzpTQU1MOjIuMDpwcm90b2NvbCI+CiAgICA8S2V5RGVzY3JpcHRvciB1c2U9InNpZ25pbmciPgogICAgICA8S2V5SW5mbyB4bWxucz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC8wOS94bWxkc2lnIyI+CiAgICAgICAgPFg1MDlEYXRhIHhtbG5zPSJodHRwOi8vd3d3LnczLm9yZy8yMDAwLzA5L3htbGRzaWcjIj4KICAgICAgICAgIDxYNTA5Q2VydGlmaWNhdGUgeG1sbnM9Imh0dHA6Ly93d3cudzMub3JnLzIwMDAvMDkveG1sZHNpZyMiPk1JSURJekNDQWd1Z0F3SUJBZ0lVWHluQ3NPL09SVTVuNUdVQU9QY2pkRnVobDdBd0RRWUpLb1pJaHZjTkFRRUxCUUF3SVRFZk1CMEdBMVVFQXd3V1pYQnpMWE5oYld3dVlubDBaUzEwWlhOMExtTnZiVEFlRncweU1qQTFNalF3TmpFM01ERmFGdzB5TXpBMU1qUXdOakUzTURGYU1DRXhIekFkQmdOVkJBTU1GbVZ3Y3kxellXMXNMbUo1ZEdVdGRHVnpkQzVqYjIwd2dnRWlNQTBHQ1NxR1NJYjNEUUVCQVFVQUE0SUJEd0F3Z2dFS0FvSUJBUUNyaTJQbHg5d1ZJd2xUaTVKTk5SUWFJUmNnOE5HSms3emNpY3k2NWJTNXpZak9TdzRTTmZHaHh4VVRCZGpYSUdoRWpyeDJnVDI5aGdaK3JPZHJ3T3RTUlFML0Y4cXZ3YndCbEdHSS9TbVZnOE1GWGk1bU91dk9qNDBJRjhYRTZqU0dvZkhSS0FqMkltOTRLL0haYlV6MUpKL0FwUjhaQUhyazk3U28vMHdaTUU1UDVXY1NuOGpQMTFQYnMrK05QdVdKWWl2TVVPU0xQcFhsNzUvRW5JYjBiK3d3RUMzSDA0OVorM01vV2xPMEp0YUpsNHh2MzRoY0IzSEpMVFFQbFBkQU9uTWtOREJ3L1dFdHZMMzJnVzFLZm8wNWtuczZ6SVY4ZlpOVXlOZW1ha3pVWUFvVUNwRW4yVlFHUEF2VWxMQUhldGdUaDRucmdYaHAwUWZ5cWZ5NUFnTUJBQUdqVXpCUk1CMEdBMVVkRGdRV0JCUmxQZ0J2U1Rtdklaa1lTbWs3elR1NDRXMXBjREFmQmdOVkhTTUVHREFXZ0JSbFBnQnZTVG12SVprWVNtazd6VHU0NFcxcGNEQVBCZ05WSFJNQkFmOEVCVEFEQVFIL01BMEdDU3FHU0liM0RRRUJDd1VBQTRJQkFRQTR6VnM5SnVZdUlneTd0MnMxcS9wbldKZVVPN2FoazVZU0dXTTI1ZGdLemxHU0NHSEIrbGNLV01jZEJZZ2pPWmY5alpOYm14KzFuSkdleVNpZlNoNnUrY3VuWnNMZXVVTjhBcWRnZWtSN2h6elZ2TTN1aW1adWJla0Q3OTBiQnlycGJWeXV2TERCeThyRjlXQXZPZHl0NDFyY0ZSTURRUVFTV3BPMWdHY1JuL29YYjJvdlFiUFp4NzIzTlpyMjlrVitKMnQ1OWR5RWxEVWdIbG9CR2lNL3ZVdmFnaVM5RTZxZzZURmVBRGFFM3R0OXJkR1M1UnNuYkltdUxSRE82ZytBNjR6WnRUb28wdDNXUWQ1RklDaHdTQWM4ZTlucnRYWUZJMnVycEdqdTV3RUZpUmkvdlN6Z1ltLy9wUEZpS1VYNGtJRVJ3VlBjOFUvVW81OUNxTjNNPC9YNTA5Q2VydGlmaWNhdGU+CiAgICAgICAgPC9YNTA5RGF0YT4KICAgICAgPC9LZXlJbmZvPgogICAgPC9LZXlEZXNjcmlwdG9yPgogICAgPEtleURlc2NyaXB0b3IgdXNlPSJlbmNyeXB0aW9uIj4KICAgICAgPEtleUluZm8geG1sbnM9Imh0dHA6Ly93d3cudzMub3JnLzIwMDAvMDkveG1sZHNpZyMiPgogICAgICAgIDxYNTA5RGF0YSB4bWxucz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC8wOS94bWxkc2lnIyI+CiAgICAgICAgICA8WDUwOUNlcnRpZmljYXRlIHhtbG5zPSJodHRwOi8vd3d3LnczLm9yZy8yMDAwLzA5L3htbGRzaWcjIj5NSUlESXpDQ0FndWdBd0lCQWdJVVh5bkNzTy9PUlU1bjVHVUFPUGNqZEZ1aGw3QXdEUVlKS29aSWh2Y05BUUVMQlFBd0lURWZNQjBHQTFVRUF3d1daWEJ6TFhOaGJXd3VZbmwwWlMxMFpYTjBMbU52YlRBZUZ3MHlNakExTWpRd05qRTNNREZhRncweU16QTFNalF3TmpFM01ERmFNQ0V4SHpBZEJnTlZCQU1NRm1Wd2N5MXpZVzFzTG1KNWRHVXRkR1Z6ZEM1amIyMHdnZ0VpTUEwR0NTcUdTSWIzRFFFQkFRVUFBNElCRHdBd2dnRUtBb0lCQVFDcmkyUGx4OXdWSXdsVGk1Sk5OUlFhSVJjZzhOR0prN3pjaWN5NjViUzV6WWpPU3c0U05mR2h4eFVUQmRqWElHaEVqcngyZ1QyOWhnWityT2Ryd090U1JRTC9GOHF2d2J3QmxHR0kvU21WZzhNRlhpNW1PdXZPajQwSUY4WEU2alNHb2ZIUktBajJJbTk0Sy9IWmJVejFKSi9BcFI4WkFIcms5N1NvLzB3Wk1FNVA1V2NTbjhqUDExUGJzKytOUHVXSllpdk1VT1NMUHBYbDc1L0VuSWIwYit3d0VDM0gwNDlaKzNNb1dsTzBKdGFKbDR4djM0aGNCM0hKTFRRUGxQZEFPbk1rTkRCdy9XRXR2TDMyZ1cxS2ZvMDVrbnM2eklWOGZaTlV5TmVtYWt6VVlBb1VDcEVuMlZRR1BBdlVsTEFIZXRnVGg0bnJnWGhwMFFmeXFmeTVBZ01CQUFHalV6QlJNQjBHQTFVZERnUVdCQlJsUGdCdlNUbXZJWmtZU21rN3pUdTQ0VzFwY0RBZkJnTlZIU01FR0RBV2dCUmxQZ0J2U1Rtdklaa1lTbWs3elR1NDRXMXBjREFQQmdOVkhSTUJBZjhFQlRBREFRSC9NQTBHQ1NxR1NJYjNEUUVCQ3dVQUE0SUJBUUE0elZzOUp1WXVJZ3k3dDJzMXEvcG5XSmVVTzdhaGs1WVNHV00yNWRnS3psR1NDR0hCK2xjS1dNY2RCWWdqT1pmOWpaTmJteCsxbkpHZXlTaWZTaDZ1K2N1blpzTGV1VU44QXFkZ2VrUjdoenpWdk0zdWltWnViZWtENzkwYkJ5cnBiVnl1dkxEQnk4ckY5V0F2T2R5dDQxcmNGUk1EUVFRU1dwTzFnR2NSbi9vWGIyb3ZRYlBaeDcyM05acjI5a1YrSjJ0NTlkeUVsRFVnSGxvQkdpTS92VXZhZ2lTOUU2cWc2VEZlQURhRTN0dDlyZEdTNVJzbmJJbXVMUkRPNmcrQTY0elp0VG9vMHQzV1FkNUZJQ2h3U0FjOGU5bnJ0WFlGSTJ1cnBHanU1d0VGaVJpL3ZTemdZbS8vcFBGaUtVWDRrSUVSd1ZQYzhVL1VvNTlDcU4zTTwvWDUwOUNlcnRpZmljYXRlPgogICAgICAgIDwvWDUwOURhdGE+CiAgICAgIDwvS2V5SW5mbz4KICAgIDwvS2V5RGVzY3JpcHRvcj4KICAgIDxOYW1lSURGb3JtYXQ+dXJuOm9hc2lzOm5hbWVzOnRjOlNBTUw6Mi4wOm5hbWVpZC1mb3JtYXQ6dHJhbnNpZW50PC9OYW1lSURGb3JtYXQ+CiAgICA8U2luZ2xlU2lnbk9uU2VydmljZSBCaW5kaW5nPSJ1cm46b2FzaXM6bmFtZXM6dGM6U0FNTDoyLjA6YmluZGluZ3M6SFRUUC1QT1NUIiBMb2NhdGlvbj0iaHR0cDovL2xvY2FsaG9zdDo2Nzg5L3NzbyI+PC9TaW5nbGVTaWduT25TZXJ2aWNlPgogICAgPFNpbmdsZVNpZ25PblNlcnZpY2UgQmluZGluZz0idXJuOm9hc2lzOm5hbWVzOnRjOlNBTUw6Mi4wOmJpbmRpbmdzOkhUVFAtUmVkaXJlY3QiIExvY2F0aW9uPSJodHRwOi8vbG9jYWxob3N0OjY3ODkvc3NvIj48L1NpbmdsZVNpZ25PblNlcnZpY2U+CiAgPC9JRFBTU09EZXNjcmlwdG9yPgo8L0VudGl0eURlc2NyaXB0b3I+").
                    description("description").
                    SSOType(2).
                    status(1).
                    build();

            UpdateSAMLProviderResponse response = iamService.updateSAMLProvider(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}