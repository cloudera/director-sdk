# Cloudera Altus Director Python Client Samples

These sample Python scripts show how some common use cases can be satisfied
using the Cloudera Altus Director Python API client.

## Getting Started

Install the Cloudera Altus Director Python API client.

```
pip install -r requirements.txt
```

Also, install and start the Cloudera Altus Director server.

## Running a Sample

Run a script with the `-h` or `--help` option for information about the
available options. The scripts have options common across all of them, and some
scripts have subcommands which accept additional options.

### TLS

When the Cloudera Altus Director server is listening over HTTPS, be sure to use the
`--cafile` options to pass a trusted certificate for the server (either its
own or one in the certificate signing chain).

## License

[Apache 2.0](LICENSE.txt)
