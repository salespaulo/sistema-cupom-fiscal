package br.com.sweda.sistema.cupom.fiscal.integration.xml.tags;

public class Transforms
{
    private Transform[] Transform;

    public Transform[] getTransform ()
    {
        return Transform;
    }

    public void setTransform (Transform[] Transform)
    {
        this.Transform = Transform;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [Transform = "+Transform+"]";
    }
}