import java.util.ArrayList;

public class Program{
	
	
	public static void main (String []args) {
		
		boolean out = false;
		
		String words = "Absorption, Achromatic, Adaptation, Aerobic, Algae, Alimentary, Allergy, Amoeba, Amphibian, Analogue, Anatomy, Ancestor, Antibody, Appendage, Aquatic, Arboreal, Asexual, Assimilation, Atrophy, Auditory" +
	            "Backbone, Bacteria, Balance, Barrier, Benign, Biology, Biome, Bisect, Botany, Branch, Breathe" +
	            "Carnivorous, Catalyst, Cavity, Cell, Chlorophyll, Cholesterol, Chromatic, Chromosome, Cilia, Classification, Cohesive, Collagen, Communicable, Community, Contraction, Control, Convolution, Coronary, Cyclic" +
	            "Darwin, Deciduous, Decomposition, Dermis, Develop, Dichotomous, Dietary, Differentiation, Diffusion, Digestion, Dinosaur, Discipline, Displacement, Division, DNA, Dominant, Dormant" +
	            "Ecology, Ecosystem, Ectoplasm, Edema, Embryo, Endangered, Endemic, Endoskeleton, Endothermic, Energy, Environment, Enzyme, Epidermis, Erosion, Essential, Estrogen, Evolution, Exoskeleton, Exothermic, Extermination, Extinct" +
	            "Factor, Feedback, Fertilization, Fetus, Fibrillation, Filament, Fish, Fission, Flower, Food chain, Fossil, Function" +
	            "Gamete, Gaseous, Gastrin, Genetics, Genome, Genus, Germ, Gestation, Gills, Grafting, Greenhouse effect, Growth" +
	            "Habitat, Hemoglobin, Herbivore, Heredity, Heterogeneous, Hibernation, Hierarchy, Homogeneous, Hormone, Horticulture, Host, Human, Hybrid" +
	            "Immunity, Inclusion, Incubate, Ingestion, Inherited traits, Inoculate, Inquiry, Insoluble, Instinct, Insulate, Insulin, Interdependent, Invertebrate, Involuntary, Isolate, Isotope" +
	            "Juncture" +
	            "Kinesthesia, Kingdom" +
	            "Latitude, Leaf, Life cycle, Linkage, Living, Luminescent, Lymph" +
	            "Malignant, Mammal, Marine, Meiosis, Membrane, Memory, Metabolism, Microbiology, Microscope, Migration, Mildew, Molt, Muscle, Mutation, Mutualism" +
	            "Natural, Nerve, Neuron, Nitrogen, Nonliving, Nucleus" +
	            "Omnivorous, Optic, Order, Organs, Osmosis, Ossification, Oviparous, Oxidation" +
	            "Paleontologist, Parasite, Parasympathetic, Pathogen, Permeable, Photosynthesis, Plankton, Plasma, Platelet, Pollen, Pollution, Portion, Predator, Preserve, Pressure, Producer, Protein, Protoplasm, Pulmonary, Pyramid" +
	            "Quest, Question" +
	            "Radial, Receptor, Recessive, Recycling, Reflex, Regeneration, Regulate, Replicate, Repress, Reptile, Residual, Resource, Respiration, Restriction, RH factor, Root" +
	            "Scope, Secrete, Seed, Sensor, Shelter, Skeleton, Skin, Solar, Spatial, Species, Specimen, Statistics, Stimulus, Stress, Structure, Symbiosis, Symmetry, Synapse, System" +
	            "Taste, Taxonomy, Tendril, Terrestrial, Tissue, Tolerance, Toxin, Transformation, Transpiration, Tundra, Turgid" +
	            "Unsaturated" +
	            "Vacuole, Variation, Ventilate, Vertebrate, Viable, Virus, Vital, Vitamin, Viviparous, Volume, Voluntary" +
	            "Waste, Weather" +
	            "X chromosome" +
	            "Y chromosome" +
	            "Zone, Zoology";

		
		String newS = "";
		String[] list = new String[300];
		list[0] = "";
		int len = 0;
		
		for(int i = 0; i < words.length(); i++) {
			
			if(!(words.charAt(i) == ',' || words.charAt(i) == ' ')) {
				
				newS += words.charAt(i);
				
			}
			
			for(int j = 0; j < list.length; j++) {
				
				
				for(i = len + 1; i < newS.length(); i++) {
					
					
					if(Character.isUpperCase(newS.charAt(i))) {
						System.out.println(i);
						break;
						
						
					}
					
					
					
				}
				
				list[j] = newS.substring(len, i);
				len += list[j].length();
				
				System.out.println(list[j]);
				
				
				
			}
			
			
		}
		
		
		System.out.println(newS);
		
		
	}
	
}